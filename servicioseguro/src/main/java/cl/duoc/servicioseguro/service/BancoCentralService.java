package cl.duoc.servicioseguro.service;   
   
   import org.springframework.stereotype.Service;
   import org.springframework.web.client.RestTemplate;
    
   @Service
   public class BancoCentralService {
       private final RestTemplate restTemplate;

       public BancoCentralService(RestTemplate restTemplate) {
           this.restTemplate = restTemplate;
       }

       public String obtenerDatos() {
           String url = "https://si3.bcentral.cl/SieteRestWS/SieteRestWS.ashx?user=be.hernandeza@duocuc.cl&pass=password&function=GetSeries×eries=F022.TPM.TIN.D001.NO.Z.D&firstdate=2025-01-01&lastdate=2025-02-01";
           return restTemplate.getForObject(url, String.class);
       }
   }