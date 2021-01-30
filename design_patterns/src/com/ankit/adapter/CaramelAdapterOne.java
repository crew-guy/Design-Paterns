package com.ankit.adapter;

import com.ankit.adapter.thirdPartyFilters.CaramelFilter;

public class CaramelAdapterOne implements Filter{
    private CaramelFilter caramel;

    public CaramelAdapterOne(CaramelFilter caramel) {
        this.caramel = caramel;
    }

        @Override
    public void apply(Image image) {
        caramel.init();
        System.out.println("Using composition to apply filter");
        caramel.render();
    }
}
