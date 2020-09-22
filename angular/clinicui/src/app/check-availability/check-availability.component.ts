import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AvailabilityService } from '../availability.service';
import { Observable } from 'rxjs';
import { Doctor } from '../doctor';

@Component({
  selector: 'app-check-availability',
  templateUrl: './check-availability.component.html',
  styleUrls: ['./check-availability.component.css']
})
export class CheckAvailabilityComponent implements OnInit {

  speciality = ["General", "Gynacologist", "Orthopedics"];
  specialization;
  submitted = false;
  doctors: Observable<Doctor[]>;
  constructor(private availabilityService: AvailabilityService,
    private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log("Clicked");
    console.log(this.specialization);
    this.submitted = true;
    this.doctors = this.availabilityService.getDoctorsList(this.specialization);
  }

}
