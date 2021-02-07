package br.victor.store.service;

import br.victor.store.dto.PurchaseDTO;
import br.victor.store.dto.SupplierInfoDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PurchaseService {

    public void createPurchase(PurchaseDTO purchaseParams) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<SupplierInfoDTO> exchange = client.exchange("http://localhost:8081/suppliers/info/" + purchaseParams.getState().getAbbreviation(),
                HttpMethod.GET, null, SupplierInfoDTO.class);
    }

}
