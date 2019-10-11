import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserInProgressComponent } from './user-in-progress.component';

describe('UserInProgressComponent', () => {
  let component: UserInProgressComponent;
  let fixture: ComponentFixture<UserInProgressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserInProgressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserInProgressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
