import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoursesindexComponent } from './coursesindex.component';

describe('CoursesindexComponent', () => {
  let component: CoursesindexComponent;
  let fixture: ComponentFixture<CoursesindexComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CoursesindexComponent]
    });
    fixture = TestBed.createComponent(CoursesindexComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
