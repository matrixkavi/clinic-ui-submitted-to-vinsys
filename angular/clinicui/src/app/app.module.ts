import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CheckAvailabilityComponent } from './check-availability/check-availability.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateAppointmentComponent } from './create-appointment/create-appointment.component';
import { AppointmentDetailsComponent } from './appointment-details/appointment-details.component';
import { AppointmentListComponent } from './appointment-list/appointment-list.component';
import { UpdateAppointmentComponent } from './update-appointment/update-appointment.component';

@NgModule({
  declarations: [
    AppComponent,
    CheckAvailabilityComponent,
    CreateAppointmentComponent,
    AppointmentDetailsComponent,
    AppointmentListComponent,
    UpdateAppointmentComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
