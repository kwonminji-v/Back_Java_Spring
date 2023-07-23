package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Book;

public interface BookRepository {
	List<Book> getAllBookList();

	List<Book> getBookListByCategory(String category);

	Set<Book> getBookListByFilter(Map<String, List<String>> filter);

	Book getBookById(String bookId);

	void setNewBook(Book book);
}
/*
 * ����ڰ� /filter/{bookFilter}��η� GET ��û�� �����ϴ�. Spring MVC�� {bookFilter}�� �ش��ϴ� ����
 * �����Ͽ� bookFilter ������ ���ε��մϴ�. �� ������ Map<String, List<String>> ���·� ����Ǿ� ������,
 * genre=romance, author=John�� ���� ��Ʈ���� ������ �Ľ��Ͽ� Map ���·� �����մϴ�.
 * bookService.getBookListByFilter(bookFilter)�� ȣ���Ͽ� �ش� ���Ϳ� �´� ���� ����� �����ɴϴ�.
 * bookByFilter ������ ����� �����մϴ�. model.addAttribute("bookList", booksByFilter)�� ����
 * �𵨿� bookList��� �̸����� ���� ����� �߰��մϴ�. "books"��� �並 ��ȯ�մϴ�. Spring MVC�� "books"���
 * �並 �� �������� ���� ã�� ó���ϰ�, ���� ����� ����ϴµ� ����մϴ�.
 */