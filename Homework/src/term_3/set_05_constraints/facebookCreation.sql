CREATE DATABASE Facebook

CREATE TABLE Users (
	Id INT NOT NULL PRIMARY KEY,
	Email VARCHAR(30) NOT NULL,
	Password VARCHAR(32) NOT NULL
)

CREATE TABLE Friends (
	FirstFriendId INT FOREIGN KEY REFERENCES Users(Id),
	SecondFriendId INT FOREIGN KEY REFERENCES Users(Id),
	CONSTRAINT FriendsPk PRIMARY KEY (FirstFriendId, SecondFriendId)
)

CREATE TABLE Walls (
	Id INT NOT NULL PRIMARY KEY,
	OwnerId INT NOT NULL FOREIGN KEY REFERENCES Users(Id),
	WriterId INT NOT NULL FOREIGN KEY REFERENCES Users(Id),
	Text NVARCHAR(300) NOT NULL,
	Date DATE NOT NULL
)

CREATE TABLE Groups (
	Id INT NOT NULL PRIMARY KEY,
	Name NVARCHAR(30) NOT NULL,
	Description NVARCHAR(300)
)

CREATE TABLE GroupMembers (
	UserId INT FOREIGN KEY REFERENCES Users(Id),
	GroupId INT FOREIGN KEY REFERENCES Groups(Id),
	CONSTRAINT GroupMembersPk PRIMARY KEY (UserId, GroupId)
)