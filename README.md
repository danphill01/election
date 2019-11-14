# Elections

## Allows the honor society president to conduct elections of exceptional members through group leaders.

President has set up database with members data including name, membership type (regular, exceptional or group leader), service hours and join date. 

Group leaders can access the web user interface and see the list of eligable members (must have at least 100 hours of community service, and be a member for at least 2 years). The group leader nominates the members that they want to be in the candidates in the election by clicking on the `Nominate` button next to the member's name. 

Once the members are nominated, the group leader may click the `Generate Ballot` button to see a ballot that can be printed for each voting member. 

Once the election is complete, the vote can be tallied from the `/tally` page. The group leader enters the number of voters and can then see a list of the candidates with a tally of their votes. The vote tally starts at zero and the button with the member's name can be clicked to increase the tally by one vote. If the number of votes for a candidate increases to at least 50% of the voter count, the candidate is elected and becomes an exceptional member.

Stack: Angular frontend with Java/Spring backend; postgres db (10.10 from docker container).

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.3.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
