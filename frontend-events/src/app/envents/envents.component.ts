import { Component, OnInit } from '@angular/core';
import { EventService } from '../event.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-envents',
  templateUrl: './envents.component.html',
  styleUrls: ['./envents.component.css']
})
export class EnventsComponent implements OnInit{

  events: any[] = [];

  constructor(private eventService:EventService, private router:Router){}


  navigateToPayment() {
    this.router.navigate(['/payment']);
  }

  ngOnInit(): void {
    console.log('Component initialized');
    this.eventService.getAllEvents().subscribe(
      data => {
        console.log('Fetched Events:',data);
        this.events = data;
      },
      error => {
        console.error('Error fetching events:',error);

      }
    )
  }

}
