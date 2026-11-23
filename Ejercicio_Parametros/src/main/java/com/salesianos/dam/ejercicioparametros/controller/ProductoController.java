package com.salesianos.dam.ejercicioparametros.controller;

import com.salesianos.dam.ejercicioparametros.model.Producto;
import com.salesianos.dam.ejercicioparametros.repository.ProductoRepository;
import com.salesianos.dam.ejercicioparametros.service.ProductoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductoController {

  ProductoRepository productoRepository;
  private final ProductoService productoService;

  public ProductoController(ProductoService productoService) {
    this.productoService = productoService;
  }


  @GetMapping("/productos")
  public ResponseEntity<Producto> buscarFiltrado(
      @RequestParam(required = false) String nombre,
      @RequestParam(required = false) List<String> rango) {

  }

}
