import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EventService {
  private apiUrl = 'http://localhost:7700/api/events';

  constructor(private http:HttpClient) { }

  getAllEvents(): Observable<any>{
    return this.http.get(this.apiUrl)
  }

  getEventById(eventId:number): Observable<any>{
    return this.http.get(`${this.apiUrl}/${eventId}`)
  }

}
