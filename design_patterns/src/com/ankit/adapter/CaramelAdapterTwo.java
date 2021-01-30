package com.ankit.adapter;

import com.ankit.adapter.thirdPartyFilters.CaramelFilter;

public class CaramelAdapterTwo extends CaramelFilter implements Filter {
    @Override
    public void apply(Image image) {
        init();
        System.out.println("Using inheritance to create adapter");
        render();
    }
}
