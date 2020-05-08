create DATABASE Project_Java_NCOVI
GO
USE Project_Java_NCOVI
GO

CREATE TABLE Personnes(
	ID bigint IDENTITY(1,1) NOT NULL,
	Ho_Ten nchar(20) not NULL,
	Dia_Chi nchar(30),
	Dien_Thoai int,
	
	--F0, F1, ISOLEE, GUERI, NORMAL
	Type_De_Sante [nchar](10),

	--Cai nay la ng gay ra benh
	ID_Reason_Per bigint,

	--Cai nay la nhung ng da tiep xuc trong xa hoi
	ID_Per_Contac bigint,

	Ngay_Cach_Ly date,
	--chi can + 14ngay
	Ngay_Het_Cach_Ly date,

	primary key (ID)
)
GO

ALTER table Personnes
add foreign key (ID_Per_Contac) references Personnes(ID)
go
ALTER table Personnes
add foreign key (ID_Reason_Per) references Personnes(ID)
go

--INSERT VALUES
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Mộng Phồn Vinh      ', N'3423 Trương Công Định         ', 384757194, N'NORMAL', null, null, NULL, NULL)
GO

--F0
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Nguyễn Thị Mộng Mơ  ', N'12 phố Huế                    ', 214785214, N'F0', null, null, CAST(N'2020-06-14' AS Date), CAST(N'2020-06-28' AS Date))
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Nguyễn Tú Tú        ', N'44 Hà Đông                    ', 647385638, N'F0', null, null, CAST(N'2020-04-10' AS Date), CAST(N'2020-04-24' AS Date))
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Hồ Nhật Huy         ', N'22 Hai Bà Trưng               ', 835719295, N'F0', null, null, CAST(N'2020-03-23' AS Date), CAST(N'2020-04-06' AS Date))
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Lương Công Của      ', N'1 Ngô Thời Vụ                 ', 285171495, N'F0', null, null, CAST(N'2020-04-13' AS Date), CAST(N'2020-03-27' AS Date))
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Quản Quý Quơ        ', N'23 Hoàng Đức                  ', 838475929, N'F0', null, null, CAST(N'2020-07-01' AS Date), CAST(N'2020-07-15' AS Date))
INSERT INTO Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Quản Quý Quơ        ', N'23 Hoàng Đức                  ', 838475929, N'F0', null, null, CAST(N'2020-07-01' AS Date), CAST(N'2020-07-15' AS Date))
GO

--F1
--INSERT Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Phạm Băng Tuyết     ', N'525 Lý Long                   ', 295727592, N'F1', 6, 8, CAST(N'2020-08-30' AS Date), CAST(N'2020-09-13' AS Date))
--INSERT Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Lã Liệu Bích        ', N'25 Huyền Trân Công Chúa       ', 292759291, N'F1', 6, 9, CAST(N'2020-11-08' AS Date), CAST(N'2020-11-22' AS Date))
--INSERT Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Bầu Bĩnh Vương      ', N'87 Hạt Cát                    ', 786259511, N'F1', null, null, CAST(N'2020-03-13' AS Date), CAST(N'2020-02-27' AS Date))
GO

--ISOLEe
INSERT Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Vũ Trung Dư         ', N'24 Bầu Bĩnh                   ', 986625266, N'ISOLEE', null, null, CAST(N'2020-05-16' AS Date), CAST(N'2020-05-30' AS Date))
INSERT Personnes (Ho_Ten, Dia_Chi, Dien_Thoai, Type_De_Sante, ID_Reason_Per, ID_Per_Contac, Ngay_Cach_Ly, Ngay_Het_Cach_Ly) VALUES (N'Cát Dính Chân       ', N'2665 Quan Trọng Lắm           ', 865723526, N'ISOLEE', null, null, CAST(N'2020-01-18' AS Date), CAST(N'2020-02-01' AS Date))
GO

--GUERI

