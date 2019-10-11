import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeSearchComponent } from './home/home-search/home-search.component';
import { SignInComponent } from './home/sign-in/sign-in.component';
import { SignUpComponent } from './home/sign-up/sign-up.component';
import { UserComponent } from './user/user.component';
import { UserSearchComponent } from './user/user-search/user-search.component';
import { UserInProgressComponent } from './user/user-in-progress/user-in-progress.component';
import { UserCompletedComponent } from './user/user-completed/user-completed.component';
import { MentorComponent } from './mentor/mentor.component';
import { MentorInProgressComponent } from './mentor/mentor-in-progress/mentor-in-progress.component';
import { MentorCompletedComponent } from './mentor/mentor-completed/mentor-completed.component';
import { MentorEditSkillComponent } from './mentor/mentor-edit-skill/mentor-edit-skill.component';
import { MentorPaymentsComponent } from './mentor/mentor-payments/mentor-payments.component';
import { UserSignUpComponent } from './home/sign-up/user-sign-up/user-sign-up.component';
import { MentorSignUpComponent } from './home/sign-up/mentor-sign-up/mentor-sign-up.component';
import { AdminComponent } from './admin/admin.component';
import { AdminSignInComponent } from './admin/admin-sign-in/admin-sign-in.component';
import { AdminEditTechnologyComponent } from './admin/admin-edit-technology/admin-edit-technology.component';
import { AdminPaymentReportComponent } from './admin/admin-payment-report/admin-payment-report.component';
import { AdminTrainingReportComponent } from './admin/admin-training-report/admin-training-report.component';
import { AdminManageAccountComponent } from './admin/admin-manage-account/admin-manage-account.component';
import { HomeSearchResultComponent } from './home/home-search-result/home-search-result.component';
import { UserSearchResultComponent } from './user/user-search-result/user-search-result.component';
import { MentorProfileComponent } from './mentor/mentor-profile/mentor-profile.component';
import { MentorResultComponent } from './mentor/mentor-result/mentor-result.component';

const routes: Routes = [{ path: '', redirectTo: "/home/search", pathMatch: 'full' },
{
  path: 'home', children: [{ path: '', redirectTo: "/home/search", pathMatch: 'full' },
  { path: 'search', component: HomeSearchComponent, children: [{ path: 'search-result', component: HomeSearchResultComponent}] },
  { path: 'sign-in', component: SignInComponent },
  { path: 'sign-up', component: SignUpComponent, children: [{ path: 'user', component: UserSignUpComponent},
  { path: 'mentor', component: MentorSignUpComponent}] }]
}, {
  path: 'user', component: UserComponent, children: [{ path: 'search', component: UserSearchComponent, children: [{ path: 'search-result', component: UserSearchResultComponent}] },
  { path: 'in-progress', component: UserInProgressComponent },
  { path: 'completed', component: UserCompletedComponent }]
},
{
  path: 'mentor', component: MentorComponent, children: [{ path: 'in-progress', component: MentorInProgressComponent, children: [{path: 'result', component: MentorResultComponent}] },
  { path: 'completed', component: MentorCompletedComponent },
  { path: 'edit-skills', component: MentorEditSkillComponent },
  { path: 'payments', component: MentorPaymentsComponent },
  { path: 'profile', component: MentorProfileComponent}]
},
{
  path: 'admin', component: AdminComponent, children: [{ path: 'sign-in' , component: AdminSignInComponent},
  { path: 'edit-technology' , component: AdminEditTechnologyComponent},
  { path: 'payments' , component: AdminPaymentReportComponent},
  { path: 'trainings' , component: AdminTrainingReportComponent},
  { path: 'accounts' , component: AdminManageAccountComponent}]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
