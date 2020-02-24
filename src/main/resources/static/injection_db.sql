DROP TABLE IF EXISTS "public"."t_user";
CREATE TABLE "public"."t_user" (
  "id" int8 NOT NULL,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "password" varchar(255) COLLATE "pg_catalog"."default"
)
;

DROP TABLE IF EXISTS "public"."t_user_info";
CREATE TABLE "public"."t_user_info" (
  "id" int8 NOT NULL,
  "uid" int8,
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "gender" int2,
  "age" int2,
  "address" varchar(255) COLLATE "pg_catalog"."default"
)
;

ALTER TABLE "public"."t_user" ADD CONSTRAINT "t_user_pkey" PRIMARY KEY ("id");
ALTER TABLE "public"."t_user_info" ADD CONSTRAINT "t_user_info_pkey" PRIMARY KEY ("id");