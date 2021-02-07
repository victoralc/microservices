package br.victor.store.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PurchaseDTO {
    private List<PurchaseItemDTO> items = new ArrayList<>();
    private AddressDTO address = new AddressDTO();
    private StateDTO state = new StateDTO();
}
