import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminTrainingReportComponent } from './admin-training-report.component';

describe('AdminTrainingReportComponent', () => {
  let component: AdminTrainingReportComponent;
  let fixture: ComponentFixture<AdminTrainingReportComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminTrainingReportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminTrainingReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
