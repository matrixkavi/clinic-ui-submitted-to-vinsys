import { Component, OnInit } from '@angular/core';
import { Appointment } from '../appointment';
import { Observable } from 'rxjs';
import { AppointmentService } from '../appointment.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-appointment-list',
  templateUrl: './appointment-list.component.html',
  styleUrls: ['./appointment-list.component.css']
})
export class AppointmentListComponent implements OnInit {

  appointments: Observable<Appointment[]>;

  constructor(private appointmentService: AppointmentService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.appointments = this.appointmentService.getAppointmentList();
  }

  deleteAppointment(id: number) {
    this.appointmentService.deleteAppointment(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  appointmentDetails(id: number){
    this.router.navigate(['details', id]);
  }

  updateAppointment(id: number){
    this.router.navigate(['update', id]);
  }
}
