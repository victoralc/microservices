package br.victor.store.controller;

import br.victor.store.dto.PurchaseDTO;
import br.victor.store.service.PurchaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping
    public ResponseEntity createPurchase(@RequestBody PurchaseDTO purchaseDTO) {
        this.purchaseService.createPurchase(purchaseDTO);
        return ResponseEntity.ok().build();
    }
}
