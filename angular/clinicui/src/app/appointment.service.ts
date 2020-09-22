import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {
  private baseUrl = 'http://localhost:8000/appointments';

  constructor(private http: HttpClient) { }

  getAppointment(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createAppointment(appointment: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, appointment);
  }

  updateAppointment(id: number, appointment: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, appointment);
  }

  deleteAppointment(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getAppointmentList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
