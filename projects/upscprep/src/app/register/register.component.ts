import { Component } from '@angular/core';
import { ApiService } from '../api.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
@Component({
  selector: 'app-register',
  standalone: true,
  imports: [],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
  registerForm: FormGroup;

  constructor(private fb: FormBuilder, private apiService: ApiService) {
    this.registerForm = this.fb.group({
      fullname: [''],
      email: [''],
      contactNumber: [''],
      password: ['']
    });
  }

  onSubmit() {
    console.log(this.registerForm.value);
    this.apiService.addData(this.registerForm.value).subscribe(response => {
      console.log(response);
      // Handle response here, maybe clear form or show a success message
    });
  }
}
