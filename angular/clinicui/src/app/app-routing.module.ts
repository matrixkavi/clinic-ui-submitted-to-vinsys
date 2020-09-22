import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CheckAvailabilityComponent } from './check-availability/check-availability.component';
import { AppointmentListComponent } from './appointment-list/appointment-list.component';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { UpdateAppointmentComponent } from './update-appointment/update-appointment.component';
import { AppointmentDetailsComponent } from './appointment-details/appointment-details.component';


const routes: Routes = [
  { path: '', redirectTo: 'appointments', pathMatch: 'full' },
  { path: 'appointments', component: AppointmentListComponent },
  { path: 'add', component: CreateAppointmentComponent },
  { path: 'update/:id', component: UpdateAppointmentComponent },
  { path: 'details/:id', component: AppointmentDetailsComponent },
  { path: 'availability', component: CheckAvailabilityComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
