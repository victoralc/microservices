package br.victor.store.service;

import br.victor.store.dto.PurchaseDTO;
import br.victor.store.dto.SupplierInfoDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseService {

    private final RestTemplate client;

    public PurchaseService(RestTemplate client) {
        this.client = client;
    }

    public void createPurchase(PurchaseDTO purchaseParams) {
        ResponseEntity<SupplierInfoDTO> exchange =
                client.exchange("http://suppliers/info/" + purchaseParams.getState().getAbbreviation(),
                HttpMethod.GET, null, SupplierInfoDTO.class);

        System.out.println(exchange.getBody().getAddress());
    }

}
