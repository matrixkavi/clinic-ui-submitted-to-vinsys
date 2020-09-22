import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AvailabilityService {
  private baseUrl = 'http://localhost:8000/enquiry/specialization';

  constructor(private http: HttpClient) { }

  getDoctorsList(specialization: string): Observable<any> {
    return this.http.get(`${this.baseUrl}/${specialization}`);
  }
}
