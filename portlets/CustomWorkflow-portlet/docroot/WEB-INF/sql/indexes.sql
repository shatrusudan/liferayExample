create index IX_E4DFF930 on test_Feedback (companyId);
create index IX_F66405BE on test_Feedback (feedbackText);
create index IX_27750BB2 on test_Feedback (groupId);
create index IX_912E935D on test_Feedback (groupId, feedBackStatus);
create index IX_7F5DE2BC on test_Feedback (uuid_);
create index IX_8C7053EC on test_Feedback (uuid_, companyId);
create unique index IX_5794E56E on test_Feedback (uuid_, groupId);