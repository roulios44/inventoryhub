package com.inventoryhub.inventoryhub.services;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.inventoryhub.inventoryhub.entities.Warehouse;
import com.inventoryhub.inventoryhub.repositories.WarehouseRepository;

public class WarehouseServiceImplementationTest {

    @Mock
    private WarehouseRepository warehouseRepository;

    @InjectMocks
    private WarehouseServiceImplementation warehouseService;

    private Warehouse warehouse1;
    private Warehouse warehouse2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        warehouse1 = new Warehouse();
        warehouse1.setId(1L);
        warehouse1.setTitle("Warehouse 1");

        warehouse2 = new Warehouse();
        warehouse2.setId(2L);
        warehouse2.setTitle("Warehouse 2");
    }

    @Test
    void testFindAll() {
        when(warehouseRepository.findAll()).thenReturn(Arrays.asList(warehouse1, warehouse2));

        List<Warehouse> warehouses = warehouseService.findAll();
        assertEquals(2, warehouses.size());
        assertEquals("Warehouse 1", warehouses.get(0).getTitle());
        assertEquals("Warehouse 2", warehouses.get(1).getTitle());
    }
}
