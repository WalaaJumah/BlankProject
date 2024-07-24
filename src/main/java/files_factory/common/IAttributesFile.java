package files_factory.common;

import java.io.IOException;
import java.util.List;

public interface IAttributesFile {
//    List<FileAttributesDetails> getJobVacancyDetails(FileAttributesDetails jobVacancyDetail) throws IOException;
    List<FileAttributesDetails> getJobVacancyDetails() throws IOException;
}
