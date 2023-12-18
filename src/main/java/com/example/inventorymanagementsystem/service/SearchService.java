package com.example.inventorymanagementsystem.service;

import com.example.inventorymanagementsystem.enitity.Product;
import com.example.inventorymanagementsystem.enitity.SearchCondition;
import com.example.inventorymanagementsystem.searcher.BrandBasedSearcher;
import com.example.inventorymanagementsystem.searcher.CategoryBasedSearcher;
import com.example.inventorymanagementsystem.searcher.NameBasedSearcher;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class SearchService {
    private final BrandBasedSearcher brandBasedSearcher;
    private final CategoryBasedSearcher categoryBasedSearcher;
    private final NameBasedSearcher nameBasedSearcher;

    @Autowired
    public SearchService(BrandBasedSearcher brandBasedSearcher, CategoryBasedSearcher categoryBasedSearcher, NameBasedSearcher nameBasedSearcher) {
        this.brandBasedSearcher = brandBasedSearcher;
        this.categoryBasedSearcher = categoryBasedSearcher;
        this.nameBasedSearcher = nameBasedSearcher;
    }

    public List<Product> search(String filter, SearchCondition searchCondition) {
        if (searchCondition.equals(SearchCondition.NAME))
            return nameBasedSearcher.search(filter);

        if (searchCondition.equals(SearchCondition.BRAND))
            return brandBasedSearcher.search(filter);

        if (searchCondition.equals(SearchCondition.CATEGORY))
            return categoryBasedSearcher.search(filter);

        return null;
    }
}
