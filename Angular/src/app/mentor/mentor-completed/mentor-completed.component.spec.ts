import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorCompletedComponent } from './mentor-completed.component';

describe('MentorCompletedComponent', () => {
  let component: MentorCompletedComponent;
  let fixture: ComponentFixture<MentorCompletedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorCompletedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorCompletedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
