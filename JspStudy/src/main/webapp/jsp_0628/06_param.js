function check() {
	if(document.frm.id.value == " ") {
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}else if (document.frm.age.value == " ") {
		aletr("나이를 입력해주세요. ");
		document.frm.age.focus();
		return false;
	} else if(isNaN(document.frm.age.value)) {
		alert("숫자로 입력해야지");
		document.frm.age.focus();
		return false;
	}else {
		return true;
	}
}
/*
form의 id 필드가 비어있는지를 검사합니다. 사용자의 포커스를 id 필드로 이동
return false;는 form의 제출을 중지시키는 역할을 합니다.
*/