package umc.study.service.StoreService;

import umc.study.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreQueryService {

    Optional<Store> findStore(Long id);
    List<Store> findStoresByNameAndAddress(String name, String address);
}
