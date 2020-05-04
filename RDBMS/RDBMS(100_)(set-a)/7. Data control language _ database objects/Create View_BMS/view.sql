create view user_travel_details as select tickets.user_ID as user_id,users.name as user_name,
schedule.source as source,schedule.destination as destination from schedule
join tickets on tickets.schedule_ID=schedule.schedule_ID
join users on tickets.user_id=users.user_id;