import { Component, OnInit } from '@angular/core';
import { Appointment } from '../appointment';
import { ActivatedRoute, Router } from '@angular/router';
import { AppointmentService } from '../appointment.service';

@Component({
  selector: 'app-update-appointment',
  templateUrl: './update-appointment.component.html',
  styleUrls: ['./update-appointment.component.css']
})
export class UpdateAppointmentComponent implements OnInit {

  id: number;
  appointment: Appointment;
  submitted = false;


  constructor(private route: ActivatedRoute,private router: Router,
    private appointmentService: AppointmentService) { }

  ngOnInit() {
    this.appointment = new Appointment();

    this.id = this.route.snapshot.params['id'];

    this.appointmentService.getAppointment(this.id)
      .subscribe(data => {
        console.log(data)
        this.appointment = data;
      }, error => console.log(error));
  }

  updateEmployee() {
    this.appointmentService.updateAppointment(this.id, this.appointment)
      .subscribe(data => console.log(data), error => console.log(error));
    this.appointment = new Appointment();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.updateEmployee();
  }

  gotoList() {
    this.router.navigate(['/appointments']);
  }
}
