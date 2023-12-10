//package org.example.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//@Repository
//public class NoteService {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public NoteService(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public void createNote(String data){
//        jdbcTemplate.update("Insert into note (content) values ("+data+")");
//    }
//}
