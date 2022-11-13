ALTER TABLE Users
ADD CreatedOn DATE

ALTER TABLE Groups
ADD CONSTRAINT descr_default DEFAULT '' FOR Description