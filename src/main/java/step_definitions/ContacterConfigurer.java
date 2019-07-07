package step_definitions;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class ContacterConfigurer implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {

        registry.defineDataTableType(new DataTableType(Helper.Contacter.class, new TableEntryTransformer<Helper.Contacter>() {
            @Override
            public Helper.Contacter transform(Map<String, String> entry) {
                return new Helper.Contacter(entry.get("FirstName"),entry.get("LastName"),entry.get("Phone"),entry.get("Email"),entry.get("Subject"),entry.get("Message"));
            }
        }));
    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

}