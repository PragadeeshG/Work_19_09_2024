create table if not exists large_language_data(
llm_code varchar(255) not null,
llm_name varchar(255) null,
localenvironment varchar(255) null,
tradeenvironment varchar(255) null,
short_description varchar(255) null,
multi_llm_option varchar(255) null,
llm_params varchar(255) null,
upload_version Integer null,
launch_environment varchar(255) null,
manage_environment varchar(255) null,
status varchar(255) null,
constraint large_language_data_pk primary key(llm_code));