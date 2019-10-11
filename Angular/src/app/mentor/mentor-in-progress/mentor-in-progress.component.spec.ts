import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorInProgressComponent } from './mentor-in-progress.component';

describe('MentorInProgressComponent', () => {
  let component: MentorInProgressComponent;
  let fixture: ComponentFixture<MentorInProgressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorInProgressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorInProgressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
