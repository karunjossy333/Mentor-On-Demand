import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorMenuNavBarComponent } from './mentor-menu-nav-bar.component';

describe('MentorMenuNavBarComponent', () => {
  let component: MentorMenuNavBarComponent;
  let fixture: ComponentFixture<MentorMenuNavBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorMenuNavBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorMenuNavBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
