package com.example.amelaproject.controllerTest;

import com.example.amelaproject.repository.TaskListRepository;
import com.example.amelaproject.service.TaskListService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class taskControllerTest {

    @Mock
    public TaskListRepository repo;

    @InjectMocks
    public TaskListService service;


    @BeforeEach
    public void setUp() {
//        MockitoAnnotations.openMocks(this);
    }
}
