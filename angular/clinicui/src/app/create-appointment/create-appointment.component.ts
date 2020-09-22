import { Component, OnInit } from '@angular/core';
import { Appointment } from '../appointment';
import { Router } from '@angular/router';
import { AppointmentService } from '../appointment.service';

@Component({
  selector: 'app-create-appointment',
  templateUrl: './create-appointment.component.html',
  styleUrls: ['./create-appointment.component.css']
})
export class CreateAppointmentComponent implements OnInit {
  appointment: Appointment = new Appointment();
  submitted = false;

  constructor(private appointmentService: AppointmentService,
    private router: Router) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.appointment = new Appointment();
  }

  save() {
    this.appointmentService.createAppointment(this.appointment)
      .subscribe(data => console.log(data), error => console.log(error));
    this.appointment = new Appointment();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/appointments']);
  }

}
