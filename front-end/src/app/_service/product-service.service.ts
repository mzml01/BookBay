import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../_model/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http:HttpClient) { }

  public addProduct(product:Product){
    return this.http.post<Product>('http://localhost:9090/addProduct',product);

  }
}
