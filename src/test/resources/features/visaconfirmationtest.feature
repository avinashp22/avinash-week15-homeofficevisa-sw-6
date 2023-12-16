Feature: Visa Feature

  @smoke @sanity @regression
  Scenario: anAustralianComingToUKForTourism.
Click on start button
Select a Nationality 'Australia'
Click on Continue button
Select reason 'Tourism'
Click on Continue button
verify result 'You will not need a visa to come to the UK'

  @regression
  Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths.
Click on start button
Select a Nationality 'Chile'
Click on Continue button
Select reason 'Work, academic visit or business'
Click on Continue button
Select intendent to stay for 'longer than 6 months'
Click on Continue button
Select have planning to work for 'Health and care professional'
Click on Continue button
verify result 'You need a visa to work in health and care'

  @sanity @regression
  Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAn
Article10Or20Card
Click on start button
Select a Nationality 'Colombia'
Click on Continue button
Select reason 'Join partner or family for a long stay'
Click on Continue button
Select state My partner of family member have uk immigration status 'yes'
Click on Continue button
verify result 'You’ll need a visa to join your family or partner in the UK'
