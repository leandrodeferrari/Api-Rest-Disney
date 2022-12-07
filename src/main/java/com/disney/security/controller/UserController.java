package com.disney.security.controller;

import com.disney.security.dto.UserDto;
import com.disney.security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

   @Autowired
    public UserController(IUserService userService){
        this.userService = userService;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<Page<UserDto>> getAll(@RequestParam("page") Integer pageNumber){
       return ResponseEntity.ok().body(userService.getAll(pageNumber));
    }

   @PatchMapping
   public ResponseEntity<UserDto> update(@RequestParam("userName") String userName, @RequestParam("password") String password){
       return ResponseEntity.ok().body(userService.update(userName, password));
   }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
       userService.deleteById(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
