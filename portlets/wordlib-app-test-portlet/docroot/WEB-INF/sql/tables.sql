create table WLA_WordlibData (
	wordlibId LONG not null primary key,
	groupId LONG,
	userId LONG,
	companyId LONG,
	imageId LONG,
	name VARCHAR(75) null,
	person VARCHAR(75) null,
	place VARCHAR(75) null,
	adjective VARCHAR(75) null,
	animal VARCHAR(75) null,
	celebrity VARCHAR(75) null,
	verb VARCHAR(75) null,
	adverb VARCHAR(75) null
);