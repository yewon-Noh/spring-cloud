package com.example.openfeign.client;

import com.example.openfeign.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "BookClient", url = "${book.client.url}")
public interface BookClient {

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    List<Book> getBooks();

    @RequestMapping(method = RequestMethod.POST, value = "/books/{bookId}", consumes = "application/json")
    Book update(@PathVariable("bookId") Long bookId, Book book);

    // req: MultipartFile, res: JSON
    @RequestMapping(method = RequestMethod.POST
            , value = "/books"
            , consumes = MediaType.MULTIPART_FORM_DATA_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE)
    List<Book> uploadBooks(@RequestPart(value = "file", required = false) MultipartFile file);

}
