import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserMenuNavBarComponent } from './user-menu-nav-bar.component';

describe('UserMenuNavBarComponent', () => {
  let component: UserMenuNavBarComponent;
  let fixture: ComponentFixture<UserMenuNavBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserMenuNavBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserMenuNavBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
