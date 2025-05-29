package cl.duoc.servicioseguro.controller;

import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;

import cl.duoc.servicioseguro.service.BancoCentralService;

   @RestController
   public class BancoCentralController {
       private final BancoCentralService bancoCentralService;

       public BancoCentralController(BancoCentralService bancoCentralService) {
           this.bancoCentralService = bancoCentralService;
       }

       @GetMapping("/datos-banco-central")
       public String obtenerDatosBancoCentral() {
           return bancoCentralService.obtenerDatos();
       }
   }