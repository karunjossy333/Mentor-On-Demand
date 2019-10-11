import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorResultComponent } from './mentor-result.component';

describe('MentorResultComponent', () => {
  let component: MentorResultComponent;
  let fixture: ComponentFixture<MentorResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
