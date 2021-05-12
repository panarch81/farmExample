package com.farm.domain;

public enum AnimalType {
  COW(ProductType.MILk),
  GOAT(ProductType.MILk),
  CHICKEN(ProductType.EGGS);

  AnimalType(ProductType productType) {
    this.productType = productType;
  }

  private ProductType productType;

  public ProductType getProductType() {
    return productType;
  }
}
