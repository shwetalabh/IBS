CREATE TABLE `User` (
  `userId` varchar(255) PRIMARY KEY,
  `userName` varchar(255),
  `email` varchar(255),
  `kyc` KYC,
  `address` Address,
  `password` varchar(255),
  `createdAt` date,
  `updateAt` date,
  `deletetAt` date
);

CREATE TABLE `UserAccount` (
  `id` int PRIMARY KEY,
  `accountNumber` varchar(255),
  `accountType` ENUM ('Savings', 'Current', 'Reccuring', 'Fixed'),
  `isActive` boolean,
  `isDenied` boolean,
  `userID` varchar(255),
  `balance` float,
  `createdAt` date,
  `updateAt` date,
  `deletetAt` date
);

CREATE TABLE `UserAccountTransaction` (
  `id` int PRIMARY KEY,
  `createdAt` date,
  `updateAt` date,
  `deletetAt` date,
  `amount` float,
  `transactionType` varchar(255),
  `transactionInfo` varchar(255),
  `userAccountId` int
);

CREATE TABLE `UserKyc` (
  `id` int PRIMARY KEY,
  `userId` varchar(255),
  `docType` ENUM ('Address', 'Adhaar'),
  `createdAt` date,
  `updateAt` date,
  `deletetAt` date
);

CREATE TABLE `Address` (
  `streat` varchar(255),
  `city` varchar(255),
  `country` varchar(255),
  `zipcode` varchar(255),
  `userId` varchar(255)
);

CREATE TABLE `Loan` (
  `id` int PRIMARY KEY,
  `userId` varchar(255),
  `loanType` varchar(255)
);

ALTER TABLE `UserAccount` ADD FOREIGN KEY (`userID`) REFERENCES `User` (`userId`);

ALTER TABLE `UserAccountTransaction` ADD FOREIGN KEY (`userAccountId`) REFERENCES `UserAccount` (`id`);

ALTER TABLE `UserKyc` ADD FOREIGN KEY (`userId`) REFERENCES `User` (`userId`);

ALTER TABLE `Address` ADD FOREIGN KEY (`userId`) REFERENCES `User` (`userId`);

ALTER TABLE `Loan` ADD FOREIGN KEY (`userId`) REFERENCES `User` (`userId`);
