package com.viettran.mockito.business;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock = mock(DataService.class);
    @InjectMocks
    private SomeBusinessImpl businessImpl;
    @Test
    void findGreatestFromAllData(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
        assertEquals(24, businessImpl.findTheGratestFromAllData());
    }
    @Test
    void findGreatestFromAllData_OneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
        assertEquals(35, businessImpl.findTheGratestFromAllData());
    }
}

