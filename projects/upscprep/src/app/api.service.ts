import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private BASE_URL = 'http://your-api-url.com/api'; // Change this to your actual API URL

  constructor(private http: HttpClient) { }

  // Method to fetch data
  fetchData(): Observable<any> {
    return this.http.get(`${this.BASE_URL}/your-fetch-endpoint`);
  }

  // Method to add data
  addData(data: any): Observable<any> {
    return this.http.post(`${this.BASE_URL}/register`, data);
  }
  
}
