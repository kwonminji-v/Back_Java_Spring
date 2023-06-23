package study_0622;

/*API(AppLication Programming Interface)는 애플리케이션 소프트웨어를 구축하고
통합하기 위한 정의 및 프로토콜세트로 애플리케이션 프로그래밍 인터페이스를 나타낸다.
API를 사용하면 구현 방식을 알지 못해도 제품 또는 서비스가 서로 커뮤니케이션할 수 있으며
애플리케이션 개발을 간소화하여 시간과 비용을 절약할 수 있다.I
새로운 물과 제품을 설계하거나 기존 틀과 제품을 관리하는 경우
API는 유연성을 제공하고 설계, 관리, 사용 방법을 간소화하며 혁신의 기회를 제공한다.

URL은 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접근할 수 있는
주소를 표현하기 위한 것으로
'프로토콜이름 : //호스트명 : 포트번호/경로명/파일명?쿼리스트링#참조' 형으로 이뤄져 있다.

https://www.codechobo.com: 80/sample/hello.html?referrer=codechobo#index1

프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규약 (http)
호스트명 : 자원을 제공하는 서비의 이름 (www.codechobo.com)
포트번호 : 통신에 사용되는 서버의 포트번호 (80)
경로명 : 접근하려는 자원이 저장된 서비상의 위치(/sample/)
파일명 : 접근하려는 자원의 이름(hello.html)
쿼리(query) : URL에서 ' ? ' 이후의 부분 (referrer = codechobo)
참고(anchor) : URL에서 ' # ' 이후의 부분 (index1)
*/

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLTest {
    public static void main(String[] args) {
        try {
        /*
         파싱은 어떤 페이지(문서, html 등) 에서 내가 원하는 데이터를 특정 패턴이나 순서로 추출해 가공하는 것을 말한다.
         파싱할 URL을 지정합니다.
         */
        	
            String urlStr = "http://openapi.seoul.go.kr:8088/관리키/xml/ListCulturalAssetsInfo/1/10/";
            String encodedUrl = URLEncoder.encode(urlStr, "UTF-8");
            URL url = new URL(encodedUrl);
            InputStream stream = url.openStream();
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(stream);
            doc.getDocumentElement().normalize();
    
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("row");
            System.out.println("-----------------------");
    
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
    
                    Element eElement = (Element) nNode;
    
                    System.out.println("문화재 번호: " + getTagValue("MANAGE_NUM", eElement));
                    System.out.println("문화재 이름: " + getTagValue("NAME_KOR", eElement));
                    System.out.println("문화재 종류: " + getTagValue("NAME_CNI", eElement));
                    System.out.println("문화재 소재지: " + getTagValue("BOARD_KOR", eElement));
                    System.out.println("문화재 크기: " + getTagValue("SCALE", eElement));    
                    System.out.println();
    
                }
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag);
        if (nlList.getLength() > 0) {
            NodeList childNodes = nlList.item(0).getChildNodes();
            Node nValue = (Node) childNodes.item(0);
            return nValue.getNodeValue();
        }
        return "";
    }
}